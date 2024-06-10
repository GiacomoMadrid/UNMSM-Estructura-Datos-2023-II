package modelo;

public class Operador {
    private Pila pila = new Pila();
    private String expresion;
    private String expresionPre;
    private String expresionPos;
    private String resultado;    
    
    public Operador(){
        this.expresion = "";
        //this.resultado = "";
        this.expresionPre = ""; 
    }
    

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

     public String getExpresionPre() {
        return expresionPre;
    }

    public boolean setExpresionPre() {
        if(verificarAgrupacion(expresion) == true){
            expresionPre = "";
            String expresionInvertida = "";
            for(int i = expresion.length()-1; i>=0; i--){
                expresionInvertida += ""+expresion.charAt(i);
            }
            expresion = expresionInvertida;
            expresionInvertida = "";
            
            for(int i = 0; i < expresion.length(); i++){
                char simbolo = expresion.charAt(i);
                if (!esOperador(simbolo)) {
                    expresionPre += simbolo;
                    
                } else {
                    if (simbolo == ')') {
                        pila.push(simbolo);
                        
                    } else if (simbolo == '(') {
                        while (!pila.isEmpty() && pila.peek() != ')') {
                            char elemento = pila.pop();
                            expresionPre += elemento;
                        }
                        if (!pila.isEmpty() && pila.peek() == ')') {
                            pila.pop(); // Elimina el ')'
                        }
                        
                    } else {
                        if(!pila.isEmpty()){
                            if(precedencia(simbolo, pila.peek())){
                                pila.push(simbolo);

                            }else{
                                char elemento = pila.pop(); 
                                expresionPre += elemento;
                                pila.push(simbolo);
                                
                            }  
                            
                        }else{
                            pila.push(simbolo);
                        }
                        
                    }    
                }
            }
            
            while (!pila.isEmpty()) {
                char elemento = pila.pop();
                expresionPre += elemento;
            }
            
            
            for(int i = expresionPre.length()-1; i>=0; i--){
                expresionInvertida += ""+expresionPre.charAt(i);
            }
            expresionPre = expresionInvertida; 
            
            return true;
        }
        
        return false;        
    }
    
     
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    public boolean verificarAgrupacion(String texto){
        int cont = 0;
        Pila parentesis = new Pila();
        
        for(int i=0; i<texto.length(); i++){
            switch (texto.charAt(i)) {
                case '(':
                    parentesis.push('(');
                    cont++;
                    break;
                    
                case ')':
                    if(parentesis.isEmpty()){
                        break;
                    }else{
                        parentesis.pop();
                    }
                    cont--;
                    break;
                                   
                default:
                    break;                
            }            
        }         
        return ((parentesis.isEmpty() == true) && (cont == 0));
        
    }

   
    public boolean esOperador(char op){
        boolean retorno = false;
        switch (op){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '(':
            case ')': retorno=true;break;
        }
        
        return retorno;
    }
    
    public boolean precedencia(char op, char op2){
        int prec1 = getPrecedencia(op);
        int prec2 = getPrecedencia(op2);
        
        return prec1 >= prec2;
    }
    
    public int getPrecedencia(char op) {
        switch (op) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
    
       
    public double resolverPrefija() {
        PilaDouble solucion = new PilaDouble();

        for (int i = expresionPre.length() - 1; i>=0; i--) {
            char simbolo = expresionPre.charAt(i);
            
            if(!esOperador(simbolo)){
                double num = (double)(simbolo-'0');
                solucion.push(num);
            
            } else {
                double operand1 = solucion.pop();
                double operand2 = solucion.pop();

                double respuesta = resolver(simbolo, operand1, operand2);
                solucion.push(respuesta);
            }
            
        }

        return solucion.pop();
    }

    private Double resolver(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            case '^':
                return Math.pow(operand1, operand2);
            default:
                throw new IllegalArgumentException("Operador no válido: " + operator);
        }
    }
    
    
}

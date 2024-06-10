package modelo;

public class Operador {
    private Pila pila = new Pila();
    private String expresion;
    private String expresionPre;
    private String result;    
    
    public Operador(){
        this.expresion = "";
        this.result = "";
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
        if(verificarAgrupacion(this.expresion) == true){
            for(int i = 0; i < expresion.length(); i++){
                char simbolo = expresion.charAt(i);
                if (!esOperador(simbolo)) {
                    expresionPre += simbolo;
                } else {
                    if (simbolo == '(') {
                        pila.insert(simbolo);
                    } else if (simbolo == ')') {
                        while (!pila.isEmpty() && pila.peek() != '(') {
                            char elemento = pila.pop();
                            expresionPre += elemento;
                        }
                        if (!pila.isEmpty() && pila.peek() == '(') {
                            pila.pop(); // Pop the '('
                        }
                    } else {
                        while (!pila.isEmpty() && precedencia(pila.peek(), simbolo)) {
                            char elemento = pila.pop();
                            expresionPre += elemento;
                        }
                        pila.insert(simbolo);
                    }
                }
            }
            
            while (!pila.isEmpty()) {
                char elemento = pila.pop();
                expresionPre += elemento;
            }
            
            return true;
        }
        
        return false;        
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    public boolean verificarAgrupacion(String texto){
        int cont = 0;
        Pila parentesis = new Pila();
        
        for(int i=0; i<texto.length(); i++){
            switch (texto.charAt(i)) {
                case '(':
                    parentesis.insert('(');
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

    public boolean Basico(char op){
        boolean r=false;
        if(op=='+') r=true;
        if(op=='-') r=true;
        if(op=='*') r=true;
        if(op=='/') r=true;
        if(op=='^') r=true;
        return r;
    }
    public boolean esOperador(char op){
        boolean r =Basico(op);
        switch (op){
            case '(':
            case ')': r=true;break;
        }
        
        return r;
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
    
    
    public double solvePrefix(String prefixExpression) {
    PilaDouble operands = new PilaDouble();
    
    for (int i = prefixExpression.length() - 1; i >= 0; i--) {
        char ch = prefixExpression.charAt(i);
        if (Character.isDigit(ch)) {
            // Si es un dígito, conviértelo a número y colócalo en la pila
            operands.insert((double)(ch - '0'));
        } else if (ch == ' ') {
            // Ignora los espacios en blanco
            continue;
        } else {
            // Es un operador, toma los dos operandos superiores de la pila, realiza la operación y coloca el resultado nuevamente en la pila
            double operand1 = operands.pop();
            double operand2 = operands.pop();
            double result = applyOperator(ch, operand1, operand2);
            operands.insert(result);
        }
    }
    
    // El resultado final estará en la cima de la pila
    return operands.pop();
}

private double applyOperator(char operator, double operand1, double operand2) {
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

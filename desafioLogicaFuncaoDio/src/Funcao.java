public class Funcao {
    public static void main(String[] args) throws Exception {
     
        int ranking = getRank(87, 28);
    }

    static int getRank(int vitoria, int derrota) {
		int saldo = vitoria - derrota;
        
               
        if(saldo < 10) {
        System.out.println("O Héroi tem o saldo de " 
        + saldo + " está no nível Ferro ");
        }
        else if(saldo > 10 && saldo < 21) {
        System.out.println("O Héroi tem o saldo de " 
        + saldo + " está no nível Bronze");
        }
        else if(saldo > 21 && saldo < 51) {
        System.out.println("O Héroi tem o saldo de " 
        + saldo + " está no nível Prata");
        }
        else if(saldo > 51 && saldo < 81) {
        System.out.println("O Héroi tem o saldo de " 
        + saldo + " está no nível Ouro");
        }
        else if(saldo > 81 && saldo < 91) {
        System.out.println("O Héroi tem o saldo de " 
        + saldo + " está no nível Diamante");
        }
        else if(saldo > 91 && saldo < 101) {
        System.out.println("O Héroi tem o saldo de " 
        + saldo + " está no nível Lendário");
        }
        else {
        System.out.println("O Héroi tem o saldo de " 
        + saldo + " está no nível Imortal");
        }
        
        return saldo;
	}
}

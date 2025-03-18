

public class ListaDosDevedores {
    public static void main( String  [] args){
        
        int [] devedores = { 142537498,176483908, 210023492,198361023};
        
        int [] clientes = {219826341, 210023492,187232409, 198361023, 198436129 };
        
        listaLivre(devedores,clientes);
    
    }
    public static void listaLivre(int [] devedores, int []clientes){

        ConjuntosDeInteiros conjuntoDevedores = new ConjuntosDeInteiros(devedores);

        for(int i  = 0; i< clientes.length;i++){
            
            if(!conjuntoDevedores.contem(clientes[i])){
                System.out.println(clientes[i]);

                
            }

            

        }
    }
    

    
}

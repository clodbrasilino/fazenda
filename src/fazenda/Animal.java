/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazenda;

/**
 *
 * @author clodbrasilino
 */
class Animal {
    
    private static int animaisCriados = 0;
    
    int quantidadeMembros;
    
    public Animal(int quantidadeMembros){
        this.quantidadeMembros = quantidadeMembros;
        Animal.criouAnimal();
    }
    
    public void fazerBarulho(){
        
    }
    
    private static void criouAnimal(){
        animaisCriados++;
    }
    
    public static int getAnimaisCriados(){
        return animaisCriados;
    }
}

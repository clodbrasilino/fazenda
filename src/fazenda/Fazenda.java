/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazenda;

import java.util.List;

/**
 *
 * @author clodbrasilino
 */
public class Fazenda extends Object {

    List<Animal> animais;
    
    public static void main(String[] args) {
        new Animal(4);
        System.out.print(Animal.getAnimaisCriados());
    }
    
}

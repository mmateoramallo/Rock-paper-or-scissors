/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author mateo
 */
public enum Hand {
    PIEDRA(0),
    PAPEL(1),
    TIJERA(2);
    
    private Integer index;
    
    private Hand(Integer index){
        this.index = index;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
    
    
    
}

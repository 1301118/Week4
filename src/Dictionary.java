/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1301118
 */
public class Dictionary {
    
    private String definition;

    /**
     *
     * @return
     */
    public String getDefinition() {
        return definition;
    }

    /**
     *
     * @param definition
     */
    public Dictionary(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return "Dictionary{" + "definition=" + definition + '}';
    }
    
    
    
}

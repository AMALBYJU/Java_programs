/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_eg;


class bank1 extends bank{
    public void interest(float principal,int time)
    {        
        System.out.println("Interest = "+((float)principal*0.05*time));
    }   
    bank1()
    {
        name = "abcd";        
    }
    
}

class bank2 extends bank{
    public void interest(float principal,int time)
    {        
        System.out.println("Interest = "+((float)(principal*Math.pow(1.05, time) - principal)));
    }   
    bank2()
    {
        name = "efgh";        
    }
    
}


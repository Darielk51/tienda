/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.service;

/**
 *
 * @author jvlan
 */
public class Userprincipal implements UserDetails{
    private Persona = persona; 
    
    public Userprincipal (Persona persona){
    this.persona = persona;
    }
    
    
    @override
    public Collection<? extends GrantedAuthority > get Autorities (){
    List<GrantedAutoty> authority = new SimpleGrantedAuthority(p);
    
    }
}

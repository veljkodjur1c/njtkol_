/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt3105.converter;

/**
 *
 * @author natal
 */
public interface Converter<Dto,Entity> {
    Entity toEntity(Dto dto);
    Dto toDto(Entity entity);
}

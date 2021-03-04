/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.audio.dao;

import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface Idao<T> {
    public int insert(T o);
    public int delete(T o);
    public int mod(T o);
    public List<T> displayAll();
    public T displayByLink(String link);
    
    public boolean update(T os);
}

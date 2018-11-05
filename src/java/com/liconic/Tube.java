/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

/**
 *
 * @author Rucha Deshpande
 */
public class Tube {
     private String barcode;
     private String location = "";
     private String rack = "";

  public String getBarcode() 
  { return this.barcode; }

  public void setBarcode(String barcode) 
  { this.barcode = barcode; }

  public String getLocation() 
  { return this.location; }

  public void setLocation(String location) 
  { this.location = location; }

   public String getRack() 
  { return this.rack; }

  public void setRack(String rack) 
  { this.rack = rack; }

}

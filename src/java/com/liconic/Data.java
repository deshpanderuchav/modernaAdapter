/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import java.util.List;

/**
 *
 * @author Rucha Deshpande
 */
public class Data {
  
     private String rackBarcode;
    private List<String> tubeBarcodes;
     
  public String getrackBarcode() 
  { return this.rackBarcode; }

  public void setrackBarcode(String rackBarcode) 
  { this.rackBarcode = rackBarcode; }
  
  
  public List<String> gettubeBarcodes() { return this.tubeBarcodes; }

  public void settubeBarcodes(List<String> tubeBarcodes) { this.tubeBarcodes = tubeBarcodes; }

  
    
}

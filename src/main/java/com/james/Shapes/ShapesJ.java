package com.james.Shapes;

public abstract class ShapesJ {
	    String NAME;
	    String COLOR;

	    //<editor-fold defaultstate="collapsed" desc="props">
	    public String getNAME() {
	        return NAME;
	    }
	    
	    public void setNAME(String NAME) {
	        this.NAME = NAME;
	    }
	    
	    public String getCOLOR() {
	        return COLOR;
	    }
	    
	    public void setCOLOR(String COLOR) {
	        this.COLOR = COLOR;
	    }
	//</editor-fold>
	    public abstract double calculateShape();
	    protected boolean ValidateName() {
	        if (this.NAME instanceof String) {
	            return true;
	        }
	        return false;
	    }
}

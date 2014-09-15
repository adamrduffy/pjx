package com.etymon.pj.object.pagemark;

import java.io.*;

/**
   Marked content operator: EMC.
   @author Nassib Nassar
*/
public class XEMC
	extends PageMarkOperator {

	public XEMC() {
	}

	public long writePdf(OutputStream os) throws IOException {
		return writeln(os, "EMC");
	}
	
	/**
	   Returns a deep copy of this object.
	   @return a deep copy of this object.
	*/
	public Object clone() {
		return this;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return (obj instanceof XEMC);
	}

}

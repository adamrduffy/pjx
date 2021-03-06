package com.etymon.pj.object.pagemark;

import java.io.*;

/**
   Path operator: f.
   @author Nassib Nassar
*/
public class Xf
	extends PageMarkOperator {

	public Xf() {
	}

	public long writePdf(OutputStream os) throws IOException {
		return writeln(os, "f");
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
		return (obj instanceof Xf);
	}

}

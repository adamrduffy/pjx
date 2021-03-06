package com.etymon.pj.object.pagemark;

import java.io.*;

/**
   Path operator: n.
   @author Nassib Nassar
*/
public class Xn
	extends PageMarkOperator {

	public Xn() {
	}

	public long writePdf(OutputStream os) throws IOException {
		return writeln(os, "n");
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
		return (obj instanceof Xn);
	}

}

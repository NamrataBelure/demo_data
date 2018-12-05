package com;
import java.util.*;
public class encapsulation {
private double balances;

	/**
 * @return the balances
 */
public double getBalances() {
	return balances;
}

/**
 * @param balances the balances to set
 */
public void setBalances(double balances) {
	this.balances = balances;
}

	public static void main(String[] args) {
		encapsulation ec=new encapsulation();
		ec.getBalances();
        System.out.println("balances:18000");
	}

}

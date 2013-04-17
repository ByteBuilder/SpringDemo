package org.chy.soldier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext1.xml"); 
		SoldierInterface soldier = (SoldierInterface)context.getBean("soldierBean");
		
		soldier.handKillEnemy();
		soldier.scatterKillEnemy();
		
		System.out.println();
		
		Captain captain = (Captain)context.getBean("captainBean");
		
		captain.handKillEnemy();
		captain.scatterKillEnemy();
	}

}

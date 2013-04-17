package org.chy.soldier;

public class Soldier implements SoldierInterface {
	private String name;
	private Weapon handWeapon;
	private Weapon scatterWeapon;
	
	public void handKillEnemy() {
		handWeapon.killEnemy();
	}
	
	public void scatterKillEnemy() {
		scatterWeapon.killEnemy();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Weapon getHandWeapon() {
		return handWeapon;
	}

	public void setHandWeapon(Weapon handWeapon) {
		this.handWeapon = handWeapon;
	}

	public Weapon getScatterWeapon() {
		return scatterWeapon;
	}

	public void setScatterWeapon(Weapon scatterWeapon) {
		this.scatterWeapon = scatterWeapon;
	}

}

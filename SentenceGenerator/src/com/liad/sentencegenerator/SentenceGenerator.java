package com.liad.sentencegenerator;

import java.util.Random;

/*
 * Author: Liad Hermelin
 */

public class SentenceGenerator {

	// generates a random Shakespearean insult
	public String getShakespeareanInsult() {
		Random rand = new Random();
		String[] adjArr = new String[] {"hateful", "nasty", "common", "bloody", "vacant", "knavish", "quarrelsome", 
				"grotesque", "revolting", "unkind", "saucy", "disgusting", "grizzled", "spotted", "cantankerous", 
				"lewd", "loathsome", "brazen", "detestable", "reeky", "repugnant", "abominable", "peevish", "greasy"};
		String[] midArr = new String[] {"ill-breeding", "low-spirited", "cold-blooded", "luggage-lipping", "double-dealing", 
				"pale-hearted", "sallow-skinned", "puke-stained", "green-eyed", "lily-livered", "eye-offending", "long-winded", 
				"pasty-faced", "dark-hearted", "low-down", "wax-eared", "onion-breathing", "paste-brained", "broke-dealing", 
				"dull-spirited", "stone-faced", "black-winged", "dull-witted", "poison-tongued"};
		String[] nounArr = new String[] {"laughingstock", "twit", "ruffian", "pirate", "buffoon", "boar", "maggot-pie", 
				"hog", "scoundrel", "dolt", "jack-a-nape", "serpent", "dullard", "devil", "dung-hill", "fool", "coward", 
				"puke-stocking", "leper", "skainsmate", "infection", "simpleton", "villain", "miscreant"};
		int adjNum = rand.nextInt(adjArr.length);
		int midNum = rand.nextInt(midArr.length);
		int nounNum = rand.nextInt(nounArr.length);
		return "Thou art a " + adjArr[adjNum] + " " + midArr[midNum] + " " + nounArr[nounNum] + "!";
	}
}
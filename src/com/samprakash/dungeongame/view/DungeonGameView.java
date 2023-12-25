package com.samprakash.dungeongame.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.samprakash.dungeongame.viewmodel.DungeonGameViewModel;

public class DungeonGameView {
   
	private static DungeonGameViewModel dungeonGameViewModel = new DungeonGameViewModel();
	private static Scanner scanner = new Scanner(System.in);
	public void startTheGame() {
		
		System.out.println("-------------------------------------------"
		+"\nEnter a size of dungeon Row and col : ");
		
		int row = scanner.nextInt() , col = scanner.nextInt();
		char [][] dungeonGame = new char[row][col];
		
		System.out.println("Enter a adventurer place : ");
		  int adventurerRow = scanner.nextInt(), adventurerCol = scanner.nextInt();
		  System.out.println("Enter a Gold Place : ");
		  int GoldRow = scanner.nextInt() , GoldCol = scanner.nextInt();
		  System.out.println("Enter a Number Of Pits : ");
		  int noOfPits = scanner.nextInt();
		  System.out.println("Enter each pits position row and Col : ");
		  int [][] pits = new int [noOfPits][2];
		  for(int i = 0 ; i < noOfPits ; i++) {
			  pits[i][0] = scanner.nextInt();
			  pits[i][1] = scanner.nextInt();
		  }
		    
		  dungeonGameViewModel.setTheGame(dungeonGame,adventurerRow ,adventurerCol
				  ,GoldRow, GoldCol, pits);
		
		  
		  boolean [][] previouslyVisited = new boolean[row][col];
		
		  dungeonGameViewModel.findAllPossiblePathsOfAdventurer(new ArrayList <>(),row,col,adventurerRow
				  ,adventurerCol,GoldRow,GoldCol, previouslyVisited);
		  dungeonGameViewModel.printAllAdventurerPossiblePaths();
		  int count = dungeonGameViewModel.printMinimumPathWithoutCollidingPits(pits);
		  System.out.println("Count is : "+count);
			/*
			 * System.out.println("Enter a Monstor Place : "); int monsterRow =
			 * scanner.nextInt() , monsterCol = scanner.nextInt();
			 * 
			 * System.out.println("Enter a Trigger Place : "); int triggerRow =
			 * scanner.nextInt() , triggerCol = scanner.nextInt();
			 * dungeonGameViewModel.setTheGame(dungeonGame,adventurerRow
			 * ,adventurerCol,GoldRow,GoldCol , monsterRow , monsterCol,triggerRow
			 * ,triggerCol); int minCount = dungeonGameViewModel.findMinimumPath();
			 * if(minCount != -1) {
			 * 
			 * dungeonGameViewModel.findThePathsOfAdventurer(adventurerRow
			 * ,adventurerCol,GoldRow ,GoldCol);
			 * 
			 * dungeonGameViewModel.findThePathsOfMonster (monsterRow
			 * ,monsterCol,GoldRow,GoldCol);
			 * 
			 * dungeonGameViewModel.showThePath();
			 * 
			 * System.out.println("MinimumCount is : "+minCount); } else {
			 * System.out.println("No Possible Solution :"); }
			 */
		 
		
	}
	public void printThePath(String path) {
		
		System.out.println(path);
		
	}

}

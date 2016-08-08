package com.CalculateBattingAverage;

public class Calculator {		
		
		private int at_Bats;
		private int hits ;
		private int doubles;
		private int triples;
		private int homeRuns;

		
		
		public Calculator (int at_Bats, int hits, int doubles, int triples, int homeRuns) {
		
			this.at_Bats =at_Bats;
			this.hits = hits;
			this.doubles = doubles;
			this.triples = triples;
			this.homeRuns = homeRuns;
			
		}



		public int getAt_Bats() {
			return at_Bats;
		}



		public void setAt_Bats(int at_Bats) {
			this.at_Bats = at_Bats;
		}



		public int getHits() {
			return hits;
		}



		public void setHits(int hits) {
			this.hits = hits;
		}



		public int getDoubles() {
			return doubles;
		}



		public void setDoubles(int doubles) {
			this.doubles = doubles;
		}



		public int getTriples() {
			return triples;
		}



		public void setTriples(int triples) {
			this.triples = triples;
		}



		public int getHomeRuns() {
			return homeRuns;
		}



		public void setHomeRuns(int homeRuns) {
			this.homeRuns = homeRuns;
		}

		
		
	}


package Assignment3;

public class mood {

	public static void main(String[] args) {
		PsychiatristObject psy = new PsychiatristObject();

		MoodyObject happy = new HappyObject();
		MoodyObject sad = new SadObject();
		psy.examine(happy);
		happy.expressFeelings();
		psy.observe(happy);
		psy.examine(sad);
		sad.expressFeelings();
		psy.observe(sad);

	}
	
}

	class PsychiatristObject {

		public void examine(MoodyObject moodyObject) {

			System.out.println("How are you feeling today");
			moodyObject.queryMood();
		}

		public void observe(MoodyObject moodyObject) {
			System.out.println("Observation:" + moodyObject.toString());

		}

	}

	class SadObject extends MoodyObject {
		String mood = "Sad";

		@Override
		protected String getMood() {
			return mood;
		}

		@Override
		public void expressFeelings() {
			System.out.println(" 'wah' 'boo hoo' 'weep' 'sob' 'weep' ");

		}

		public String toString() {
			return "Subject cries a lot";
		}

	}

	class HappyObject extends MoodyObject {
		String mood = "Happy";

		@Override
		protected String getMood() {
			return mood;
		}

		@Override
		public void expressFeelings() {
			System.out.println("hehehe...hahaha...HAHAHAHA");

		}

		public String toString() {
			return "Subject laughs a lot";
		}

	}

	abstract class MoodyObject {	
	
		protected abstract String getMood();
	
		protected abstract void expressFeelings();		
	
		public void queryMood() {
			System.out.println("I feel " + this.getMood() + " today");
	}
	
}




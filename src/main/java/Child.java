public class Child extends Person{
	private Parent parent1;
	private Parent parent2;
	private Child[] siblings = new Child[0];

	public Child(String name, int age, Parent parent1, Parent parent2) {
		super(name, age);
		this.parent1 = parent1;
		this.parent2 = parent2;
	}

	public Parent getParent1() {
		return this.parent1;
	}

	public Parent getParent2() {
		return this.parent2;
	}

	public Child[] getSiblings() {
		return this.siblings;
	}

	public void setSiblings(Child[] siblings) {
		this.siblings = siblings;
	}

	public void addSibling(Child sibling) {
		Child[] tempSiblings = new Child[this.siblings.length+1];
		for (int i = 0;i<this.siblings.length;i++) {
			tempSiblings[i] = this.siblings[i];
		}
		tempSiblings[this.siblings.length] = sibling;
		this.siblings = tempSiblings;
	}

	

}

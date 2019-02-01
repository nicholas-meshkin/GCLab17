package gcLab17;

public class Country {
protected String name;
protected int population;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPopulation() {
	return population;
}
public void setPopulation(int population) {
	this.population = population;
}
public Country() {
	
}
public Country(String name, int population) {
	super();
	this.name = name;
	this.population = population;
}
@Override
public String toString() {
	return String.format("%-25s%-13s%-10d","Country: " + name,"Population = ",population);
}
}

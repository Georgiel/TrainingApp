package uk.ac.shu.webarch.trainingapp

class Exercise {

	String exerciseName
	int percentage
	int improvement
	int goalWeight
	String bodyPart
	String equipment
	Set sessionExercise
	
	static hasMany = [sessionExercise: Sessionexercise]
	static mappedBy = [sessionExercise: 'exerciseName']
	
    static constraints = {
	
	
    }
}

/*** Test Commands ***/
val sqlContext = new org.apache.spark.sql.SQLContext(sc)
val people = sqlContext.jsonFile("/Users/srinivasankr/Downloads/spark-1.6.1/examples/src/main/resources/people.json")
people.count()
people.registerTempTable("people")
val peopleData = sqlContext.sql("SELECT * FROM people")
peopleData.foreach(println)


val peopleDataFilter = sqlContext.sql("SELECT * FROM people WHERE  age >10")
peopleDataFilter.foreach(println)
/*** Test Commands ***/
 
/*** Log Stat Event ***/
val sqlContext = new org.apache.spark.sql.SQLContext(sc)
val rawlogstatevent = sqlContext.jsonFile("/Users/srinivasankr/Downloads/LogStatEvent.json")
rawlogstatevent.count()
/*** Log Stat Event ***/

people.registerTempTable("people")
val peopleData = sqlContext.sql("SELECT * FROM people")
peopleData.foreach(println)


val peopleDataFilter = sqlContext.sql("SELECT * FROM people WHERE  age >10")
peopleDataFilter.foreach(println)

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.sql.SQLOutput;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class todoapp {
    public static void main(String[] args) {
        MongoClient client= MongoClients.create("mongodb://localhost:27017/");
        var TodolistDB=client.getDatabase("ToDolist");
        // to access the databse
       // TodolistDB.createCollection("todolist");

        // to access the collection
        var todoCollection=TodolistDB.getCollection("todolist");
        var tododocument=new Document();
        tododocument.append("Taskname","work on mongoDb");
        tododocument.append("TaskDate","13 august 2024");
        tododocument.append("TaskTime","13hrs");
        tododocument.append("TaskStatus",false);
        todoCollection.insertOne(tododocument);


        //to update the document
        // chaneg the date if status is false in all document
        todoCollection.updateMany(new Document("TaskStatus",false),
                new Document("$set",new Document("TaskDate","17 aug 2024" )));

        todoCollection.deleteOne(new Document("TaskStatus",true));
        ArrayList =(ArrayList<Document> todoCollection.find());
for (Document document: todoList)
{
    System.out.println();



    }
}
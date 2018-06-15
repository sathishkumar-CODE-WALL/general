package com.tryout.randomstuff;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestExternalizable {

	public static void main(String args[]) throws Exception, IOException{
		Employee emp = new Employee();
		ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("testSer.ser"));
		op.writeObject(emp);
		System.out.println("Serializing"  );
		ObjectInputStream ip = new ObjectInputStream(new FileInputStream("testSer.ser"));
		Employee emp1 = (Employee)ip.readObject();
		System.out.println("deSerializing"  +emp1.id +emp1.name );
	}
}

class Employee implements Externalizable{

	int id=10;
	String name ="sathish";
	
	public Employee(){
	}
	
	@Override
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
		id=(int)oi.readObject();
		name =(String)oi.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput oo) throws IOException {
		oo.writeObject(id);
		oo.writeObject(name);
	}
	
}

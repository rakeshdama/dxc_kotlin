package advanced.serialization;

import java.io.*;


public class Externalization implements Externalizable{
	
	String s;
	int i,j;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject("Rakesh");
		out.writeInt(21);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.s = (String) in.readObject();
		this.i = in.readInt();		
	}
	
		public static void main(String[] args) throws IOException, ClassNotFoundException{
			Externalization externalization = new Externalization();
			FileOutputStream fos = new FileOutputStream("externalizationdemo");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(externalization);
			oos.close();
			
			FileInputStream fis = new FileInputStream("externalizationdemo");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Externalization externalization2 = (Externalization) ois.readObject();
			ois.close();
			
			System.out.println("i="+externalization2.i+" j="+ externalization2.j+" s="+externalization2.s);
		}
	
	}
	


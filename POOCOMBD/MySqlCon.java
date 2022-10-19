import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class MysqlCon{  
public static void main(String args[]){ 

 
try{  

Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
// aonde tem db aluno mude para o nome do seu banco ,root para o nome do user e senai pela senha do user 
"jdbc:mysql://localhost:3306/dbaluno","root","senai");  

Statement stmt=con.createStatement();  
//passa o comando 

ResultSet rs=stmt.executeQuery("select * from aluno");  
while(rs.next())  
//retorno do comando em rs É UMA VARIAVEL NORMAL do tipo ResultSet 
System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
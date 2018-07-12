package com.spi.mysore;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class ItemAttributeDAOImpl implements ItemAttributesDAO {
	private DataSource dataSource;
	private Connection conn;
	private Statement st ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void createItem(ItemAttributes ia) {
		
		try {
			String inserQuery = "insert into springdb.itemattributes(item_name, price, size, "
					+ "color) values ('" + ia.getItem_name() +"',"+
					ia.getPrice()+",'"+
					ia.getSize()+"','"+
					ia.getColor()+"')";
			
			
			conn = dataSource.getConnection();
			st = conn.createStatement();
			st.executeUpdate(inserQuery);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

	public ItemAttributes getByItemId(int itemId) {
		ItemAttributes iaReturn = null;
		try {
			iaReturn = new ItemAttributes();
			String selectQuery = "select * from itemattributes where item_attribute_id="+ itemId;
			
			
			conn = dataSource.getConnection();
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(selectQuery);
			while(rs.next()){
				iaReturn.setItem_attribute_id(rs.getInt("item_attribute_id"));
				iaReturn.setItem_name(rs.getString("item_name"));
				iaReturn.setPrice(rs.getFloat("price"));
				iaReturn.setColor(rs.getString("color"));
				iaReturn.setSize(rs.getString("size"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

		return iaReturn;
	}

}




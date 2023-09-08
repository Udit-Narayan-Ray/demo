package com.hibernate.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class table_model {
		@Id
		private int rn;
		private String name;
		
		public void setRn(int rn)
		{
			this.rn=rn;
		}
		public int getRn()
		{
			return this.rn;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public String getName()
		{
			return this.name;
		}
}

package com.hibernate.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Demo")
public class table_model {
		@Id
		@Column(name="Rollno")
		private int rn;
		@Column(name="Name")
		private String name;
		@Column(name="Branch")
		private String branch;
		
		public void setBranch(String branch)
		{
			this.branch=branch;
		}
		public String getBranch()
		{
			return this.branch;
		}
		
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
		
		@Override
		public String toString()
		{
			return "[ "+"Roll NO:-"+this.rn+" Name:-"+this.name+" Branch:-"+this.branch+" ]";
		}
}

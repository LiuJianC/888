package get_java;

import java.io.PrintStream;

public class Java_get {

	public static void main(String[] args) {
		System.err.println("git����");
		System.out.println("sf");
		System.err.println("jj");
		System.err.println("fweg");
		PrintStream out = System.out;
		out.append((char) 0);
		System.err.println("git����");
		System.out.println("sf");
		System.err.println("jj");
		System.err.println("fweg");
		PrintStream out1 = System.out;
		out1.append((char) 0);

		System.err.println("git����");
		System.out.println("sf");
		System.err.println("jj");
		System.err.println("fweg");
		PrintStream out2 = System.out;
		out2.append((char) 0);

		<?xml version="1.0" encoding="UTF-8" ?>
		<!DOCTYPE configuration
		    PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
		    "http://mybatis.org/dtd/mybatis-3-config.dtd">

		<configuration>

			<environments default="env">
				<!-- environment����ÿ�����ݿ⻷�� -->
				<!-- id���Ը���ͬ�Ļ���ȡ��Ψһ��ʾ�� -->
				<environment id="env">
					<!-- mybatis�Դ��������������transactionManager������������� -->
					<!-- type����ָ����������������� -->
					<transactionManager type="JDBC"></transactionManager>
					
					<!-- dataSourceָ������Դ������ָ���������ݿ�������Ϣ -->
					<!-- type����ָ������Դ�����ͣ�pooled-����,���ݿ����ӳ� -->
					<dataSource type="POOLED">
						<!-- -������ -->
						<property name="driver" value="oracle.jdbc.OracleDriver"/>
						<!-- url -->
						<property name="url" value="jdbc:oracle:thin://localhost:1521/orcl"/>
						<!-- �û��� -->
						<property name="username" value="scott"/>
						<!-- ���� -->
						<property name="password" value="00000"/>
					</dataSource>
				</environment>
			</environments>

			<mappers>
				<mapper resource="Student.xml" />
				<mapper resource="Teacher.xml" />
			</mappers>

		</configuration>

		
		package com.lj.entity;

		public class Teacharr {

			private int t_id;
			private String t_name;
			public int getT_id() {
				return t_id;
			}
			public void setT_id(int t_id) {
				this.t_id = t_id;
			}
			public String getT_name() {
				return t_name;
			}
			public void setT_name(String t_name) {
				this.t_name = t_name;
			}
			@Override
			public String toString() {
				return "Teacharr [t_id=" + t_id + ", t_name=" + t_name + "]";
			}
			
			
		}


	}
}

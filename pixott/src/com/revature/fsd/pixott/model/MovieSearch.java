
	package com.revature.fsd.pixott.model;

	public class MovieSearch {
		private int id;
		private String name;
		
		public MovieSearch() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MovieSearch other = (MovieSearch) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "MovieSearch [id=" + id + ", name=" + name + "]";
		}

		public void setName1(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setId11(int int1) {
			// TODO Auto-generated method stub
			
		}

		public void setName11(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setId1(int int1) {
			// TODO Auto-generated method stub
			
		}
		

	}



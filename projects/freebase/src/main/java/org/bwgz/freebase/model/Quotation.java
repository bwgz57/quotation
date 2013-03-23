/*
 * Copyright (C) 2013 bwgz.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as 
 * published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.bwgz.freebase.model;

import org.bwgz.freebase.annotation.FBProperty;
import org.bwgz.freebase.annotation.FBEntity;

@FBEntity(type="/media_common/quotation")
public class Quotation extends Test {
	private static final long serialVersionUID = -1716011939012246389L;
	
	@FBProperty(property_value="/media_common/quotation")
	private String type;
	@FBProperty
    private String id;
	@FBProperty
    private String name;
	@FBProperty
	private Person[] author;
		
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person[] getAuthor() {
		return author;
	}
	public void setAuthor(Person[] author) {
		this.author = author;
	}
}

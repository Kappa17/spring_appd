/**
 * JpaService.java
 *
 * robgion
 * www.2clever.it
 * 
 * 29 nov 2017
 * For further information please write to info@2clever.it
 */
package com.opengest.core.business.services;

import javax.persistence.EntityManager;

/**
 * @author robgion
 *
 */
public interface JpaService extends DatabaseService<EntityManager>{

	EntityManager getDatabaseConnection();

}
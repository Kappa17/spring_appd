/**
 * UserService.java
 *
 * robgion
 * www.2clever.it
 * 
 * 05 lug 2017
 * For further information please write to info@2clever.it
 */
package it.clever.spring.services;

import java.util.List;

import it.clever.spring.entities.Order;

/**
 * @author robgion
 *
 */
public interface OrderService extends LoggableAopService {

	public Order createNewOrder(Long customerId, Long productId, int quantity, double amount) throws Exception;

	public List<Order> loadAllOrders() throws Exception;
}

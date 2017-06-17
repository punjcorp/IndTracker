/**
 * 
 */
package gov.in.pb.pollution.indtracker.service;

import gov.in.pb.pollution.indtracker.domain.Type;

/**
 * @author admin
 *
 */
public interface TypeService {

	Iterable<Type> getAllTypes();

	Type getTypeById(Integer id);

	boolean deleteTypeById(Integer id);

	Type saveType(Type type);

}

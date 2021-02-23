/*
 * Copyright 2021 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.graphql.dgs.springdata.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DgsSpringDataConfiguration {
}


///**
// *
// */
//@DgsSpringDataConfiguration
//interface PersonRepository extends CrudRepository<Person, Long> {
//
//    List<Person> findByLastname(String lastname);
//
//    @GraphlQuery(path = "byFirstname")
//    List<Person> findByFirstnameLike(String firstname);
//
//    @GraphlMutation
//    Person upsertPerson(Person person);
//}
//
//class Person{ }
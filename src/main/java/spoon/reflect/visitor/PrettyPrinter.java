/**
 * Copyright (C) 2006-2017 INRIA and contributors
 * Spoon - http://spoon.gforge.inria.fr/
 *
 * This software is governed by the CeCILL-C License under French law and
 * abiding by the rules of distribution of free software. You can use, modify
 * and/or redistribute the software under the terms of the CeCILL-C license as
 * circulated by CEA, CNRS and INRIA at http://www.cecill.info.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the CeCILL-C License for more details.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C license and that you accept its terms.
 */
package spoon.reflect.visitor;

import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

import java.util.List;
import java.util.Map;

/**
 * This interface defines the pretty printers.
 */
public interface PrettyPrinter {

	/**
	 * Gets the package declaration contents.
	 */
	String getPackageDeclaration();

	/**
	 * Prints the package info.
	 */
	String printPackageInfo(CtPackage pack);

	/**
	 * Gets the contents of the compilation unit.
	 */
	String getResult();

	/**
	 * Resets the buffering of results
	 */
	void reset();

	/**
	 * Calculates the resulting source file for a list of types. The source
	 * compilation unit is required for calculating the line numbers mapping.
	 */
	void calculate(CompilationUnit sourceCompilationUnit, List<CtType<?>> types);

	/**
	 * Gets the line number mapping between the generated code and the original
	 * code.
	 */
	Map<Integer, Integer> getLineNumberMapping();

}

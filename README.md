<div align="center">
<table width="1000px">
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
    <span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>
<div align="center">
    <table width="1000px">
        <theader>
            <tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
        </theader>
        <tbody>
            <tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
            <tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Hashing</td></tr>
            <tr><td>NÚMERO DE PRÁCTICA:</td><td>07</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td width="60px">III</td></tr>
            <tr><td>FECHA DE PRESENTACION:</td><td>07-Ago-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">22:00</td></tr>
            <tr>
            <td colspan="4">NOMBRE:
                <ul>
            	    <li>Melsy Melany Huamaní Vargas 100% - mhuamanivar@unsa.edu.pe</li>
                </ul>
            </td>
            <td>NOTA:</td>
            <td></td>
            </tr>
            <tr><td colspan="6" width="1000px">DOCENTE:
                <ul>
        	    <li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
                </ul>
            </td>
            </tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>SOLUCIÓN Y RESULTADOS</th></tr>
        </theader>
        <tbody>
	    <tr><td>I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS
        <br/>
        <br/>
	    	EJERCICIO: Implementar una tabla hash.
        		<ul>
                	<li>Explicación del ejercicio:
                    	<ul>
            	            <li>En primer lugar se crearon las clases User en base al código del repositorio, así como TablaHash con los métodos que se tenían en la interface de HashTable que también se encuentra en el repositorio mandado, y por último se tiene la clase Principal en donde se implementa una tabla de usuarios, y se utiliza cada método de la clase TablaHash.</li>
                            <br/>
                            <li>Al momento de ejecutar el programa, se podrá visualizar que los datos de los usuarios u1 al u9 se encuentran en la tabla, puesto que fueron los datos con los que se inició. Aquí se puede ver como al principio la tabla esta vacía verificando con "isEmpty()", ya que no se había creado aún la tabla, y después de crearla y agregarles los datos de los usuarios con el método "put()", se ejecuta el método de "toString()" de la tabla para imprimar. Por último se ejecuta la línea de código de "isEmpty()" nuevamente para comprobar que ya no se encuentra vacía.</li>
                            <br/>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/tablaInicial.JPG" style="width:96%; height:auto"/>
                            </center>
                            <br/>
                            <li>Luego se muestra el siguiente menú, en donde después se pedirá escribir un número del 1 al 11 (1,2,3,4,5,6,7,8,9,10,11), para ejecutar ciertas acciones en la tabla ya creada según la opción escogida del menú. Después de escoger la opción, le pedirá datos o se imprimiran datos según la opción y aparecerá nuevamente el menú hasta que escriba "11", que saldrá del programa.</li>
                            <br/>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/menuOpciones.JPG" style="width:50%; height:auto"/>
            				</center>
                            <br/>
                            <li>1: Si se escribe el número 1 se imprimirá si la tabla está vacía o no, puesto que llama al método "isEmpty()". Por ejemplo, en la primera imagen se observa lo que imprime cuando la tabla esta vacía (después de hacer un "clear()" o escribir la opción 8) y en la segunda se ve lo que imprime cuando la tabla no está vacía. </li>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/isEmpty1.JPG" style="width:45%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/isEmpty2.JPG" style="width:48%; height:auto"/>
                            </center>
                            <br/>
                            <li>2: Si se escribe el número 2, se imprimirá la cantidad de registros que se encuentran actualmente en la tabla al llamar al método "size()". Se puede visualizar en la siguiente imagen un ejemplo.</li>
                            <br/>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/size.JPG" style="width:50%; height:auto"/>
                            </center>
                            <br/>
                            <li>3: Si se escribe el número 3, se pedirá ingresar el código de usuario (hashCode del User, debe ser un número entero) y se imprimirá si es que el usuario ingresado por su código se encuentra en la tabla, llamando al método "containsKey()". Por ejemplo, en la primera imagen se observa lo que imprime cuando el código ingresado si le pertenece a algún usuario y la segunda imagen cuando no se encuentra el código en la tabla.</li>
                            <br/>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/containsKey.JPG" style="width:48%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/containsKey2.JPG" style="width:48%; height:auto"/>
            				</center>
                            <br/>
                            <li>4: Si se escribe el número 4, a diferencia del anterior, aquí se pide ingresar en primer lugar un String del nombre del usuario, luego el ID (entero) con el que se encuentra y finalmente su correo electrónico (String). A partir de ello se evaluará si es que el usuario se encuentra en la tabla, como en la primera imagen; o si es que no, como en la segunda. Para ello se llama al método "containsValue()" de la tabla.</li>
                            <br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/containsValue.JPG" style="width:48%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/containsValue2.JPG" style="width:48%; height:auto"/>
                            </center>
                            <br/>
                            <li>5: Si se escribe el número 5, se pedirá ingresar el código de usuario (hashCode del User).</li>
                            <br/>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/get.JPG" style="width:48%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/get2.JPG" style="width:48%; height:auto"/>
                            </center>
                            <br/>
                            <li>6: Si se escribe el número 6,</li>
                            <br/>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/put.JPG" style="width:45%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/put2.JPG" style="width:48%; height:auto"/>
            				</center>
                            <br/>
                            <li>7: Si se escribe el número 7,</li>
                            <br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/remove.JPG" style="width:45%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/remove2.JPG" style="width:48%; height:auto"/>
                            </center>
                            <br/>
                            <li>8: Si se escribe el número 8, se limpiará la tabla quedando completamente nula y se borrará todos los datos de los usuarios de la tabla, por lo que se llama al método "clear()".</li>
                            <br/>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/clear.JPG" style="width:50%; height:auto"/>
                            </center>
                            <br/>
                            <li>9: Si se escribe el número 9, retorna el hashcode creado de la tabla, por lo que se llama al método sobreescrito "hashCode()".</li>
                            <br/>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/hashCode.JPG" style="width:50%; height:auto"/>
            				</center>
                            <br/>
                            <li>10: Si se escribe el número 10, imprimirá toda la tabla según el método sobreescrito que se llama "toString()" de la tabla creada.</li>
                            <br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab07/main/imagenes/toString.JPG" style="width:50%; height:auto"/>
                            </center>
                            <br/>
                            <li>11: Si se escribe el número 11, el programa finalizará completamente.</li>
                            <br/>
    	        		</ul>
                    </li>
                    <br/>
    	        </ul>
            </td>
            </tr>
            <tr><td>II. SOLUCIÓN DEL CUESTIONARIO<br />
                No hubo cuestionario correspondiente a este laboratorio.
            </td>
            </tr>
	    <tr><td>III. CONCLUSIONES<br />
		En conclusión, las tablas hash nos ayudan a organizar mejor los datos de varios elementos por medio de hash codes o indices que dependerán del tamaño de la tabla, es así que se optimiza al existir un método de reorganización como el encadenamiento cuando existen colisiones de índices en la tabla. De esta manera, para la búsqueda de elementos también será más óptimo ya que dependerá de un único hash code y se buscará solo en el índice que se obtenga de este en la tabla.</td>
            </tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>RETROALIMENTACIÓN GENERAL</th></tr>
        </theader>
        <tbody>
            <tr height="150px"><td width="1000px"></td></tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>REFERENCIAS Y BIBLIOGRAFÍA</th></tr>
        </theader>
        <tbody>
            <tr><td width="1000px">
			<ul>
                <li><a href="https://lineadecodigo.com/java/usar-una-hashtable-java/">https://lineadecodigo.com/java/usar-una-hashtable-java/</a></li>
                <li><a href="https://www.cpp.edu/~ftang/courses/CS240/lectures/hashing.htm">https://www.cpp.edu/~ftang/courses/CS240/lectures/hashing.htm</a></li>
    		</ul>
	    	</td></tr>
        </tbody>
    </table>
</div>

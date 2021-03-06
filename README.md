﻿# Pattterns - Factory 

## La herramienta Maven

![](https://upload.wikimedia.org/wikipedia/commons/0/0b/Maven_logo.svg)

**¿Cuál es su mayor utilidad?**

* Maven puede administrar la construcción, informes y documentación de un proyecto a partir de una pieza central de información. Crear y gestionar cualquier proyecto basado en Java, permitir que un desarrollador comprenda el estado completo de un esfuerzo de desarrollo en el período de tiempo más corto.

**Fases de maven**

Cada ciclo de vida se compone de las siguientes fases:
![](https://github.com/Cesar-Ortiz/Lab2-CVDS/blob/master/Fases.PNG)

**Ciclo de vida de la construcción**

Existen tres ciclos de vida en el sistema: default, clean y site. 

1. ***Default:*** El ciclo de vida default gestiona la construcción y el despliegue del proyecto.

2. ***Clean:*** El ciclo de vida clean controla la limpieza del proyecto.

3. ***Site:*** El ciclo de vida site controla la creación del site de documentación de proyecto.

**¿Para qué sirven los plugins?**

* Los plugins son artefactos que proporcionan objetivos a Maven.Es más, un plugin puede tener uno o mas objetivos donde cada objetivo representa una capacidad de dicho plugin. 
Los plugins pueden contener información que indique la fase del ciclo de vida a la que asociar un objetivo. 

**¿Qué es y para qué sirve el repositorio central de maven?**

* Un repositorio Maven es una estructura de directorios que contiene los plugins y sus dependencias organizados por groupId y artifactId.

## Preguntas adicionales

**¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?**

* Al ejecutar las instrucciones anteriores (Sin parámetros, qwerty, pentagon, Hexagon) solo funcionó "Hexagon" debido a que el parámetro debe ser escrito con letra MAYUSCULA al principio. 

**Investigue para qué sirve "gitignore" y cómo se usa.**

* Es una herramienta imprescindible que sirve para decirle a Git qué archivos o directorios completos debe ignorar y no subir al repositorio de código. Únicamente se necesita crear un archivo especificando qué elementos se deben ignorar y, a partir de entonces, realizar el resto del proceso para trabajo con Git de manera habitual. 

**Referencias**

<https://rubensa.wordpress.com/2016/06/10/maven-lifecycle/#:~:text=Maven%20se%20fundamenta%20en%20el,proyecto%20concreto%20est%C3%A1%20definido%20claramente.>

<https://www.it-swarm.dev/es/maven/cuales-son-los-objetivos-y-fases-de-maven-y-cual-es-su-diferencia/1071905498/>

<https://maven.apache.org/>






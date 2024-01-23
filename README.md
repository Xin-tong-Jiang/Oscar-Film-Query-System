# Oscar-Film-Query-System

## System User Manual

### 1 Application introduction

#### 1.1 Application Overview

This work is called "Oscar Award-winning Movie Query System", which aims to provide users with query and introduction functions for the 94th Academy Awards movies.

The work is designed and developed based on the MVC model (JSP+Servlet+JavaBean), uses JDBC technology to access the database, uses Maven to manage the project, and finally presents the HTML page in DIV+CSS style.

#### 1.2 Application features

At the functional level, it includes all the winning movies of the 94th Academy Awards, allowing users to quickly understand the winning movie information.

At the implementation level, the MVC design pattern can be used to effectively separate display and logic, making it suitable for project development.

At the display level, the readability and aesthetics of the page are improved by changing the display interface of different types of award-winning movies.

### 2 Instructions for use

#### 2.1 Interface introduction

The homepage of the work contains all movie poster information. By clicking on the poster, you can jump to the corresponding movie interface.

According to the type of film awards, it can be divided into three categories: film category, character category, and effects category. This work designs different interfaces for different types of awards.

+ The content of the movie interface includes: movie name, poster, awards, director, country, release time, Douban score and plot summary.

+ The content of the character interface is: winner, photo, award, date of birth, nationality and personal introduction.

+ The effects interface contains: movie name, poster, awards, director, country, release time, Douban score and plot summary.

#### 2.2 Program usage instructions
### 2.2.1 Home page

The website homepage is accessed through http://localhost:8080/ch07/home_page.jsp. For the home page, see page introduction 2.1.

#### 2.2.2 Access resources
How to access movies:

(1) Click directly on the movie poster;

(2) Enter http://localhost:8080/ch07/film?id=001 to access. Among them, the part after id= is the movie number, and the accessible range is 1-23.
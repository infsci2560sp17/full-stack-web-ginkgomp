# YukiAndYuto

## Summary Changes
  Created a Location entity, a Location Reposity, a REST web service for location and Location Controller. Also, a welcome page, a login page and a page listing pet-friendly locations created. Using webjars to handle Bootstrap dependency into Maven. For Location page, by using Bootstrap and myself-defined CSS files to add more styles.   
 Note: I will handle image variable later on Location entity. For now, all locations will have same image. 
 
___


1. What is the proposed name for your Web application?
    * YukiAndYuto  (it’s my two dogs name)
2. Who is the target audience for your Web application?
    * Pet Owners (especially dog owners) who live in urban seek for public areas that allow pets. Also, dog lovers who want to browse interesting information about dogs.  
3. What problem is it intended to solve for the target audience?
    * Me as a pet owner, who has two dogs, once I moved to Pittsburgh, I found that many public places in urban areas like coffee shops, restaurants, parks, hotels and so on may not allow pet owners to bring their dogs. But for sometimes, like weekends, dog owners may prefer to bring their dogs with them rather than to lock their dogs at home. Finding out these public areas where allow pets can provide pet owners more chances to spend great time with their pets. Pet owners also need a place to share their experiences. I will post my dogs daily life frequently, share my dogs’ funny photos and videos. Also, provide a guide about these “pet friendly” areas, and my reviews, experiences, recommended events at these places. 
4. How will it meet the minimum project requirements?
    * My site is free for public, most of the content can be freely accessible without a login. If users want to share their experiences as pet owners, add other user’s posts as their favorites, or interact with each other, and leave a comment, then they will need an account and password, which I will store in my database. However, OAuth2 authentication will be applied if users do not want to spend time to create a new account on my site. If user has an account, once he signed in, he can access to his personal account page, where he can find all his posts, favorites and likes, also updating or deleting his posts. All public data will be accessible through RESTful services. I will use HTML, CSS, some jQuery and Bootstrap features combined with my own styling and layout to help me design my site. Sever-side I will use Java to connect with my database. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    * My site can attract dog lovers, and most importantly, it will be a good choice for dog owners who live in Urban want to discover great places to have fun with their dogs, to share their experiences and to make new friends. I will view posts and comments, find popular ‘pet-friendly’ public places by the feedback from users. Based on that, I may hold events at these popular pet-friendly places and invite active users and of course, their pets to join events. Also, termly motivation messages will sent to inactive users who live near these popular places and encourage them to participate interesting events with their pets. 


## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-ginkgomp.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-ginkgomp)

## Changelog

[Changelog](/CHANGELOG.md)

## Web Site

[YukiAndYuto](https://young-shore-19904.herokuapp.com/)

![](https://github.com/infsci2560sp17/full-stack-web-ginkgomp/blob/master/src/main/resources/static/image/logo.png)

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.

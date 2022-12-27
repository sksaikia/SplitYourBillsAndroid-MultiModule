# SplitYourBillsAndroid-MultiModule

## Terminology
- Space : Can consider it as a group where user can put multiple transactions
- Transaction: Transaction is the reason for which user does the money related transfer
- Transaction Details: It the original amount which the user pays or owes from someone

## User Journey
- User lands on Authentication Selector Screen , gets to choose between login or register
- Once the user registers/logs in , user lands on the All Spaces screen
- All spaces screen 
  - The user will see total balance of transactions, total in and out amount . User will also get a list of all spaces which he is a part of .
  - On Clicking any of the space, it will navigate the user to Space Detail screen, where the user can see space name, description, creator, and get a list of members and all transactions

- All Transaction screen
  - The user will see total balance of transactions, total in and out amount . User will also get a list of all transactions which he is a part of .
  - on clicking on any of the transaction, gets the transaction description and money related details to it

- Create New Transaction Screen
  - User creates a new transaction and selects the space related to it 
  - Once the transaction is created , the user gets the option to select how to split the bills , User can manually split the bills on the bill split screen


## Tech Stack

**UI:** Jetpack Compose, Compose Navigation

**Network:** Retrofit, Kotlin Flows

**Dependency Injection:** Hilt

**Server:** Spring boot application deployed on Railway with MySQL



Screenshots

## Screens
Start Screen            |  Transactions Loading Screen | Space Loading Screen | 
:-------------------------:|:-------------------------: | :-------------------------: | 
<a href="url"><img src="https://user-images.githubusercontent.com/42187769/204085885-06332f92-ac76-483f-a750-13c836e67581.png" align="left" height="550" width="250" ></a> | <a href="url"><img src="https://user-images.githubusercontent.com/42187769/204086058-6dddcfcf-d037-4817-aefd-b3f41edaa022.png" align="left" height="550" width="250"  ></a> | <a href="url"><img src="https://user-images.githubusercontent.com/42187769/204086055-bd6e34e9-f63e-401f-b992-8c0f48392bff.png" align="left" height="550" width="250"  ></a> | 

Select Contacts Screen        |  Space Details Screen | Home Screen | 
:-------------------------:|:-------------------------: | :-------------------------: | 
<a href="url"><img src="https://user-images.githubusercontent.com/42187769/204086032-1f720561-3565-477b-895e-acfd8572f4b8.png" align="left" height="550" width="250"  ></a> | <a href="url"><img src="https://user-images.githubusercontent.com/42187769/204086040-67dde1ec-3074-48a7-ad0a-461d6a5991f1.png" align="left" height="550" width="250"  ></a> | <a href="url"><img src="https://user-images.githubusercontent.com/42187769/204086045-e4a00168-c251-4ebe-a1b4-a7ff075f0f53.png" align="left" height="550" width="250"  ></a> | 


Empty Transactions Screen      |  Manual Bill Split Screen | Transaction Detail Screen | 
:-------------------------:|:-------------------------: | :-------------------------: | 
<a href="url"><img src="https://user-images.githubusercontent.com/42187769/204086046-18edab1d-b2be-4471-bbf9-07f3d73854cd.png" align="left" height="550" width="250"  ></a>| <a href="url"><img src="https://user-images.githubusercontent.com/42187769/204086049-cafe78d0-a357-4be1-9c08-938c374e65ed.png" align="left" height="550" width="250"  ></a> | <a href="url"><img src="https://user-images.githubusercontent.com/42187769/204086053-382164d1-506a-4cae-ab20-f45a50b7e48e.png" align="left" height="550" width="250"  ></a>| 


Transaction Home Screen        |  Create New Space Screen | Create Transaction Screen |
:-------------------------:|:-------------------------: | :-------------------------: |
<a href="url"><img src="https://user-images.githubusercontent.com/42187769/204086054-5bf2558a-73a3-49b6-bf4a-52a932bacde2.png" align="left" height="700" width="300" ></a> | <a href="url"><img src="https://user-images.githubusercontent.com/42187769/204086838-6e91663f-652b-46be-a9c0-2d32e9714b00.png" align="left" height="700" width="300" ></a> | <a href="url"><img src="https://user-images.githubusercontent.com/42187769/204088019-da31fb76-3df9-43c9-b846-e8d30c1a4708.png" align="left" height="700" width="300" ></a> |

Profile Screen   |  Image Picker Screen | 
:-------------------------:|:-------------------------: | 
<a href="url"><img src="https://user-images.githubusercontent.com/42187769/209632903-e88729e4-cd2c-4ed2-ba20-67584601a464.png" align="left" height="700" width="300" ></a> | <a href="url"><img src="https://user-images.githubusercontent.com/42187769/209632912-6263f9cf-2875-4aa2-8560-732ff1f89a17.png" align="left" height="700" width="300" ></a> | 

<br />



## Features

- Multi-modular architecture with Jetpack Compose
- Network calls using Kotlin Flow and Retrofit

- Each module is following Clean Architecture with MVVM
- Use SharedPreference to store user auth token

- Contact Picker library to pick multiple contacts from device
- Image Picker [Instagram style]


## Optimizations

- Replace Shared Preference with Data Store

- Use caching with Room DB to have offline support


## Roadmap

- ~~Add Profile Screen for user~~

- ~~Create Media Picker~~

- Add Home Screen

- Add Transactions Graph Module 

- Add Dark Mode support

- Add Caching with Room



https://user-images.githubusercontent.com/42187769/208670574-0962852b-47ac-4805-818b-fb0327e96447.mp4



Figma - https://www.figma.com/file/1ALLsJ6F4cvegH2y2LOAdo/Split-Your-Bills?node-id=0%3A1 



Using Placeholder images from - <a href="https://www.freepik.com/free-vector/empty-concept-illustration_7117865.htm#query=empty%20state&position=1&from_view=keyword">Image by storyset</a> on Freepik 

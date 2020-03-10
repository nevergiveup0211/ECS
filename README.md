# ECS
Node Server 
=========================================================

ECS ==== Amazon Elastic Container Services)

ECR  ------( Elastic Container Registry)


Create VPC and Subnets
Create Security Group
Create Load Balncer
Create ECS Cluster
===========================================================================================

Cloudformation==== Create Stack

Upload 1. VPC and Subnets file which is written in yaml
	2. Security group file which is written in yaml
	3. Load Balncer file which is written in yaml
	4. ECS Cluster file which is also written in yaml

Respectively it will automatically creates 

1 VPC, 2 Private Subnets and 2 Public Subnets and 1 Security Group and 1 Load Balancer
==============================================================================================

Craete a Dockerfile
-----------------------


create an new file (new.js)
---------------------------

This Project Need to setup with Node app
===============================================================


Push the dockerfile to ECR

docker push 016973021151.dkr.ecr.us-west-1.amazonaws.com/ecs-example-repository:new


=======================================================================================

AWS Code Pipeline
-----------------

Get Started === Pipeline Name: ecspipeline
		Source Provider: Github
				Connect to Github and login with username and paswword.
		Repository: Click on existing Github ECS Repo
		Branch: Master
Build:-
		Build Provider: select AWS CodeBuild
		Select Record Button: Create an new build project
	Create new Project
		Project Name:ecscodebuild
		Envorinment Image: select(Use an image manged by AWS CodeBuild)
				OS: ubuntu
				Runtime: Docker
				Version: Docker version

	Down VPC: Select existing VPC for ECS, select 2 private subnets and 1 Host security Group
					and Create Project

Deploy:-
		Deployment provider: select Amazon ECS
		Cluster Name: ecs-example
		Service Name: new
		ImageFile: new

AWS Service Role:-

		Role: AWS-codepipeline-service

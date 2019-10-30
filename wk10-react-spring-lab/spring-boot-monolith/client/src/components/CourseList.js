import React, {Component} from 'react';
import Course from './Course';
import CourseNewForm from './CourseNewForm';

class CourseList extends Component {
  constructor(props){
    super(props);
    this.state = {
      courses: [],
      dataLoaded: false
    }
  }

  componentDidMount(){
    fetch('/course/list', {
      method: 'get',
      headers: {
        'Content-Type' : 'application/json'
      }
    })
      .then((res) => {
        return res.json()
      })
      .then((res) => {
        console.log(res)
        this.setState({
          courses: res,
          dataLoaded: true
        })
        console.log(this.state.courses, "<--- HERE")
      })
      .catch((error) => {
        console.log('Error retrieving courses!')
        console.log(error)
      })
  }

  createCourse = async (course, index) => {
    fetch('http://localhost:8080/course', {
      method: "post",
      headers: {
        "Accept" : 'application/json, text/plain, */*',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        name: course.name,
        code: course.code
      })
    })
      .then(res => res.json())
      .then(res => {
        const courses = this.state.courses;
        courses.push(res);
        this.setState({
          courses: courses
        })
      })
      .catch(err => console.log(err))
  }

  render(){
    return (
        <div>
        <CourseNewForm createCourse={this.createCourse}/>
          <h1>Courses Board</h1>
        {
          this.state.courses.map((course, index) => {
            return (
              <Course
                {...course}
                key={index} />
              )
          })
        }
        </div>
      );
    }
}

export default CourseList;


// const courses = this.state.courses.map((course, key) => {
//    return <Course course={course} key={key}/>
// })

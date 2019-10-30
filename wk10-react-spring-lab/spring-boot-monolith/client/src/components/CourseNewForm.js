import React, {Component} from 'react';

class CourseNewForm extends Component {
  constructor(props){
    super(props);
    this.state = {
      newCourse: {}
    }
  }
    handleChange = (e) => {
      const attributeToChange = e.target.name;
      const newValue = e.target.value;

      const updatedNewCourse = {...this.state.newCourse};
      updatedNewCourse[attributeToChange] = newValue;
      this.setState({newCourse: updatedNewCourse});
    }

    handleSubmit = (e) => {
      e.preventDefault()

      this.props.createCourse(this.state.newCourse);
    }

    render() {
      return (
        <div>
          <h2>Create New Course</h2>

          <form onSubmit={this.handleSubmit}>
            <div>
              <label htmlFor="title">Name</label>
              <input
                name="name"
                type="text"
                onChange={this.handleChange} />
            </div>

            <div>
              <label htmlFor="description">Code</label>
              <input
                name="code"
                type="text"
                onChange={this.handleChange} />
            </div>
            <div>
              <input type="submit" value="Create Course" />
            </div>
          </form>

          <hr />
          <hr />
        </div>
      );
    }
  }

export default CourseNewForm;

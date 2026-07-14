import "./App.css";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (

      <div className="container">

        <div className="box">
          {showBooks && <BookDetails />}
        </div>

        <div className="box">
          {showBlogs ? <BlogDetails /> : null}
        </div>

        <div className="box">
          {showCourses ? <CourseDetails /> : null}
        </div>

      </div>

  );

}

export default App;
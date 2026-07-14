import { blogs } from "./Data";

function BlogDetails() {

    return (

        <div>

            <h2>Blog Details</h2>

            {blogs.map(blog => (

                <div key={blog.id}>
                    <h4>{blog.title}</h4>
                    <b>{blog.author}</b>
                    <p>{blog.description}</p>
                </div>

            ))}

        </div>

    );

}

export default BlogDetails;
package hr.algebra.pppkandroidapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import hr.algebra.pppkandroidapp.dao.Person
import jp.wasabeef.picasso.transformations.RoundedCornersTransformation
import java.io.File

class PersonAdapter(
    private val context: Context,
    private val people: MutableList<Person>
) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val ivImage = itemView.findViewById<ImageView>(R.id.ivImage)
        val ivDelete = itemView.findViewById<ImageView>(R.id.ivDelete)

        fun bind(person: Person) {
            tvTitle.text = person.toString()

            Picasso
                .get()
                .load(File(person.picturePath))
                .error(R.mipmap.ic_launcher)
                .transform(RoundedCornersTransformation(50, 5))
                .into(ivImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.person, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivDelete.setOnLongClickListener {
            true
        }
        holder.itemView.setOnLongClickListener {
            true
        }

        holder.bind(people[position])
    }

    override fun getItemCount() = people.size
}